package com.bahadir.starbuzz.Services;

import com.bahadir.starbuzz.Models.Drink;
import com.bahadir.starbuzz.R;

import java.util.ArrayList;

public class DrinkService {
    public static final String DRINK_EXTRA = "com.bahadir.starbuzz.DRINK_EXTRA";

    public static ArrayList<Drink> getDrinksList() {
        ArrayList<Drink> drinkArrayList = new ArrayList<>();

        drinkArrayList.add(new Drink("Latte", "Latte, İtalyanca'da Süt anlamına gelmektedir.Asıl " +
                "adı Caffe Latte Machiatodur. Espresso, buharla ısıtılmış kıvamlı süt dolu bir " +
                "kupaya eklenir. Genellikle ince ve uzun bardakta servis edilir. İsteğe göre " +
                "üzerine süt köpüğü ve tatlı krema eklenir.",
                R.drawable.latte));

        drinkArrayList.add(new Drink("Turkish Coffee",
                "ürk kahvesi, daha çok Türk kültüründe önemli yere sahip Osmanlı " +
                        "İmparatorluğu'dan günümüze kadar gelmiş en eski kahve hazırlama ve " +
                        "pişirme metotlarındandır. Kendine has tadı, köpüğü, kokusu, sunuluş " +
                        "biçimiyle özgün bir kimliği ve geleneği vardır. Telvesi ile ikram edilen" +
                        " tek kahve türüdür.",
                R.drawable.turkish_coffee));

        drinkArrayList.add(new Drink("Filter Coffee",
                "Indian filter coffee is a coffee drink made by mixing frothed and boiled milk " +
                        "with the infusion obtained by percolation brewing of finely ground coffee",
                R.drawable.filter_coffee));

        drinkArrayList.add(new Drink("Cappuccino",
                "Cappuccino, İtalyan yapımı bir kahve türüdür. Espresso ve sıcak sütün " +
                        "kaynatılmasıyla meydana gelir.",
                R.drawable.cappuccino));

        return drinkArrayList;
    }
}
