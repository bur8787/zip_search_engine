package jp.suzutt.zip_search_engine.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.zip.ZipInputStream;

public class EntryLogic {
	private static final String downloadPath = "http://www.post.japanpost.jp/zipcode/dl/kogaki/zip/add_1512.zip";

	public void entry() {
		try {
			URL url = new URL(downloadPath);
			URLConnection openConnection = url.openConnection();
			if (openConnection instanceof HttpURLConnection) {
				HttpURLConnection conn = (HttpURLConnection) openConnection;
				try (InputStream inputStream = conn.getInputStream()) {
					File tempFile = File.createTempFile("tmp", ".zip");
					FileOutputStream outputStream = new FileOutputStream(
							tempFile);
					byte[] buf = new byte[1024 * 8];
					int length = 0;
					while ((length = inputStream.read(buf)) != -1) {
						outputStream.write(buf, 0, length);
					}
					FileInputStream zipFile = new FileInputStream(tempFile);
					ZipInputStream zipInputStream = new ZipInputStream(zipFile,
							Charset.forName("UTF-8"));
					while(zipInputStream.getNextEntry() != null){
						while ((length = zipInputStream.read(buf)) != -1) {
							outputStream.write(buf, 0, length);
						}
					zipInputStream.closeEntry();
					}
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
