package com.example.cars.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cars.R;
import com.example.cars.constants.CarsConstants;
import com.example.cars.data.CarMock;
import com.example.cars.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    //Variáveis da classe
    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        /**
         * Customização da ActionBar
         */
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        //Instancia variáveis
        this.mCarMock = new CarMock(this);

        //Instancia elementos de interface
        this.mViewHolder.imgCarPicture = this.findViewById(R.id.img_car_pic);
        this.mViewHolder.textManufacturer = this.findViewById(R.id.text_manufacturer);
        this.mViewHolder.textModel = this.findViewById(R.id.text_car_model);
        this.mViewHolder.textHorsePower = this.findViewById(R.id.text_horse_power);
        this.mViewHolder.textPrice = this.findViewById(R.id.text_price);

        //Obtém o valor passado por parâmetro
        this.getDataFromActivity();

        //Atribui os valores aos elementos de interface
        this.setDat();

    }

    /**
     * Obtém o valor passado por parâmetro
     */
    private void getDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mCar = this.mCarMock.get(extras.getInt(CarsConstants.CAR_ID));


        }
    }

    /**
     * Atribui os valores aos elementos de interface
     */
    private void setDat() {
        this.mViewHolder.imgCarPicture.setImageDrawable(this.mCar.picture);
        this.mViewHolder.textManufacturer.setText(this.mCar.manufacturer);
        this.mViewHolder.textModel.setText(this.mCar.model);
        this.mViewHolder.textHorsePower.setText(String.valueOf(this.mCar.horsePower));
        this.mViewHolder.textPrice.setText("R$ " + String.valueOf(this.mCar.price));

    }

    /**
     * ViewHolder
     */
    private static class ViewHolder {
        ImageView imgCarPicture;
        TextView textModel;
        TextView textManufacturer;
        TextView textHorsePower;
        TextView textPrice;

    }
}
