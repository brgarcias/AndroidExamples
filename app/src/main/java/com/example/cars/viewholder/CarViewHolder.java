package com.example.cars.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cars.R;
import com.example.cars.entities.Car;
import com.example.cars.listener.OnListClickInteractionListener;

/**
 * Responsável por fazer as manipulações dos elementos de interface
 */
public class CarViewHolder extends RecyclerView.ViewHolder {

    //Elemento de interface
    private ImageView mImgCarPicture;
    private TextView mTextCarModel;
    private TextView mTextViewDetails;

    /**
     * Construtor
     */
    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        this.mImgCarPicture = itemView.findViewById(R.id.img_car_pic);
        this.mTextCarModel = itemView.findViewById(R.id.text_car_model);
        this.mTextViewDetails = itemView.findViewById(R.id.text_view_details);
    }

    /**
     * Atribui valores aos elementos
     */
    public void bindData(final Car car, final OnListClickInteractionListener listener) {

        //Altera valor
        this.mImgCarPicture.setImageDrawable(car.picture);
        this.mTextCarModel.setText(car.model);

        //Adiciona evento de click
        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(car.id);
            }
        });
    }
}
