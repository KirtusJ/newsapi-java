package com.company;

import java.io.*;
import java.util.HashMap;

import com.google.gson.Gson;


public class Request {
    private String api_key;
    private HashMap<String, String> payload = new HashMap<>();

    public Request(String api_key) {
        this.api_key = api_key;
        this.payload = payload;
    }
    private void get_source(String sources) {
        if (sources != null) {
            this.payload.put("sources", sources);
        }
    }
    private void get_query(String query) {
        if (query != null) {
            this.payload.put("query", query);
        }
    }
    private void get_language(String language) {
        if (language != null) {
            this.payload.put("language", language);
        }
    }
    private void get_country(String country) {
        if (country != null) {
            this.payload.put("country", country);
        }
    }
    private void get_page_size(Integer page_size) {
        if (page_size != null) {
            String value = Integer.toString(page_size);
            this.payload.put("page_size", value);
        }
    }
    private void get_page_count(Integer page_count) {
        if (page_count != null) {
            String value = Integer.toString(page_count);
            this.payload.put("page_count", value);
        }
    }

    public String data(String data) {
        Gson gson = new Gson();
        return gson.toJson(data);
    }

    public void query_top(String query, String sources, String language, String country, Integer page_size, Integer page_count) throws IOException {
        get_source(sources);
        get_query(query);
        get_language(language);
        get_country(country);
        get_page_size(page_size);
        get_page_count(page_count);
    }
    public String query_everything() throws IOException {
        String link = "https://newsapi.org/v2/everything";
        return link;
    }

    public String query_sources() throws IOException {
        String link = "https://newsapi.org/v2/sources";
        return link;
    }
}
