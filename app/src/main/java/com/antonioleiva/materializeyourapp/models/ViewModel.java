/*
 * Copyright (C) 2015 Antonio Leiva
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.antonioleiva.materializeyourapp.models;

import android.databinding.BindingAdapter;
import android.os.Parcel;
import android.os.Parcelable;

import com.antonioleiva.materializeyourapp.widgets.SquareImageView;
import com.squareup.picasso.Picasso;

public class ViewModel implements Parcelable {
    public static final Creator<ViewModel> CREATOR = new Creator<ViewModel>() {
        @Override
        public ViewModel createFromParcel(Parcel in) {
            return new ViewModel(in);
        }

        @Override
        public ViewModel[] newArray(int size) {
            return new ViewModel[size];
        }
    };
    private String text;
    private String image;

    public ViewModel(String text, String image) {
        this.text = text;
        this.image = image;
    }

    protected ViewModel(Parcel in) {
        text = in.readString();
        image = in.readString();
    }

    @BindingAdapter({"android:src"})
    public static void loadImage(SquareImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(text);
        dest.writeString(image);
    }
}
