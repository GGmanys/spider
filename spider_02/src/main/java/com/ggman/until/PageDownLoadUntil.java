package com.ggman.until;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class PageDownLoadUntil {

    /**
     * 获取页面
     * @param args
     */
    public static void main(String[] args) {
        String url = "http://localhost:8080/m/index";
        String content = PageDownLoadUntil.getPageContent(url);
        System.out.println(content);
    }


    public static String getPageContent(String url ){
        HttpClientBuilder builder = HttpClients.custom();
        CloseableHttpClient client = builder.build();

        HttpGet request = new HttpGet(url);
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.84 Safari/537.36");
        String content = null;
        try {
            CloseableHttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            content = EntityUtils.toString(entity);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
