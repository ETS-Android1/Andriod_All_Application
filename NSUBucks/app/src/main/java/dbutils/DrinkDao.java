package dbutils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.nsubucks.Drink;

import java.util.ArrayList;
import java.util.List;

public class DrinkDao {
    Context context;
    DataBaseHelper dataBaseHelper;

    public DrinkDao(Context context) {
        dataBaseHelper = new DataBaseHelper(context);
    }

    public void saveDrink(Drink drink) {
        SQLiteDatabase sq = dataBaseHelper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("id", drink.getId());
        cv.put("name", drink.getName());
        cv.put("information", drink.getInformation());
        cv.put("price", drink.getPrice());
        cv.put("imgid", drink.getImgId());
          sq.insert("drink", null, cv);
        Log.i("saveDrink", "Successes");
        sq.close();
    }

    public List<Drink> getAllDrinks() {
        List<Drink> drinkList = new ArrayList<>();

        SQLiteDatabase sq = dataBaseHelper.getReadableDatabase();
        String sql = "Select * from drink";
        Cursor cursor = sq.rawQuery(sql, null);
        // get each record  and wrap into the  drink object
        if (cursor.moveToFirst())
            do {
                Drink drink = new Drink();
                drink.setId(Integer.parseInt(cursor.getString(0)));
                drink.setName(cursor.getString(1));
                drink.setInformation(cursor.getString(2));
                drink.setPrice(Integer.parseInt(cursor.getString(3)));
                drink.setImgId(Integer.parseInt(cursor.getString(4)));
                drinkList.add(drink);
            } while (cursor.moveToNext());
      return drinkList;

    }



}
