package com.example.eko.recyclerview;

import java.util.ArrayList;

public class datahero {
    public static String[][] data = new String[][]{
            {"Spiderman", "Marvel", "http://media.comicbook.com/2018/04/spider-man-1099203.jpeg"},
            {"Captain America", "Marvel", "https://i.pinimg.com/originals/99/fd/97/99fd97e6a3ab69932785110bebb7e411.jpg"},
            {"Thor", "Marvel", "https://static.tvtropes.org/pmwiki/pub/images/mcu_thor.png"},
            {"Gatot Kaca", "Indonesia", "https://cdna.artstation.com/p/assets/images/images/000/061/372/large/gatotkaca.jpg?1399722019"},
            {"Ant Man", "Marvel", "https://cdn.idntimes.com/content-images/post/20180627/39b945faac4ce13d4edd80bc18ec6202_600x400.jpg"},
            {"Hulk", "Marvel", "http://c3.thejournal.ie/media/2012/05/hulk-390x285.jpg"}
    };

    public static ArrayList<Hero> getListData(){
        Hero heroku = null;
        ArrayList<Hero> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            heroku = new Hero();
            heroku.setName(data[i][0]);
            heroku.setRemarks(data[i][1]);
            heroku.setPhoto(data[i][2]);

            list.add(heroku);
        }

        return list;
    }
}
