package com.example.android.phonenews.Common;

import com.example.android.phonenews.Interface.IconBetterIdeaService;
import com.example.android.phonenews.Interface.NewsService;
import com.example.android.phonenews.Remote.IconBetterIdeaClient;
import com.example.android.phonenews.Remote.RetrofitClient;


public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public  static final String API_KEY="030c46a85feb475882e41da1ff5aae09"; // a7072d9c2ad9495a8dd5cb58a7fd30df

    public static NewsService getNewsService() {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=a7072d9c2ad9495a8dd5cb58a7fd30df
    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}
