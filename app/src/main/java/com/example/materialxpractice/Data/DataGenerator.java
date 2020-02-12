package com.example.materialxpractice.Data;

import android.content.Context;
import android.content.res.TypedArray;

import com.example.materialxpractice.Model.People;
import com.example.materialxpractice.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@SuppressWarnings("ResourceType")
public class DataGenerator  {

    private static Random r = new Random();

    public static int randInt(int max) {
        int min = 0;
        return r.nextInt((max - min) + 1) + min;
    }

    public static List<String> getStringsShort(Context ctx) {
        List<String> items = new ArrayList<>();
        String name_arr[] = ctx.getResources().getStringArray(R.array.strings_short);
        for (String s : name_arr) items.add(s);
        Collections.shuffle(items);
        return items;
    }

    public static List<String> getStringsMedium(Context ctx) {
        List<String> items = new ArrayList<>();
        String name_arr[] = ctx.getResources().getStringArray(R.array.strings_medium);
        for (String s : name_arr) items.add(s);
        Collections.shuffle(items);
        return items;
    }

    public static List<String> getFullDate(Context ctx) {
        List<String> items = new ArrayList<>();
        String name_arr[] = ctx.getResources().getStringArray(R.array.full_date);
        for (String s : name_arr) items.add(s);
        Collections.shuffle(items);
        return items;
    }


    public static List<Integer> getAllImages(Context ctx) {
        List<Integer> items = new ArrayList<>();
        TypedArray drw_arr = ctx.getResources().obtainTypedArray(R.array.all_images);
        for (int i = 0; i < drw_arr.length(); i++) {
            items.add(drw_arr.getResourceId(i, -1));
        }
        Collections.shuffle(items);
        return items;
    }

    public static List<Integer> getNatureImages(Context ctx) {
        List<Integer> items = new ArrayList<>();
        TypedArray drw_arr = ctx.getResources().obtainTypedArray(R.array.sample_images);
        for (int i = 0; i < drw_arr.length(); i++) {
            items.add(drw_arr.getResourceId(i, -1));
        }
        Collections.shuffle(items);
        return items;
    }

    public static List<String> getStringsMonth(Context ctx) {
        List<String> items = new ArrayList<>();
        String arr[] = ctx.getResources().getStringArray(R.array.month);
        for (String s : arr) items.add(s);
        Collections.shuffle(items);
        return items;
    }

    /**
     * Generate dummy data people
     *
     * @param ctx android context
     * @return list of object
     */
    public static List<People> getPeopleData(Context ctx) {
        List<People> items = new ArrayList<>();
        TypedArray drw_arr = ctx.getResources().obtainTypedArray(R.array.people_images);
        String name_arr[] = ctx.getResources().getStringArray(R.array.people_names);

        for (int i = 0; i < drw_arr.length(); i++) {
            People obj = new People();
            obj.image = drw_arr.getResourceId(i, -1);
            obj.name = name_arr[i];
            obj.email = getEmailFromName(obj.name);
            obj.imageDrw = ctx.getResources().getDrawable(obj.image);
            items.add(obj);
        }
        Collections.shuffle(items);
        return items;
    }

//    method copas dari Tools
    public static String getEmailFromName(String name) {
        if (name != null && !name.equals("")) {
            String email = name.replaceAll(" ", ".").toLowerCase().concat("@mail.com");
            return email;
        }
        return name;
    }
}
