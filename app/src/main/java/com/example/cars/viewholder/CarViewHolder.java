package com.example.cars.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cars.R;
import com.example.cars.entities.Car;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        this.mTextModel = itemView.findViewById(R.id.text_model);
    }

    public void bindData(Car car) {
        this.mTextModel.setText(car.model);
    }
}
