package me.dio.soccernewsfemme.data.remote;


import java.util.List;

import me.dio.soccernewsfemme.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SoccerNewsApi {

    @GET("news.json")
    Call<List<News>> getNews();
}