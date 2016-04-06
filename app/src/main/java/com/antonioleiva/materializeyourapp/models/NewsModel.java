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

import android.os.Parcel;
import android.os.Parcelable;

public class NewsModel implements Parcelable {

    public static final Creator<NewsModel> CREATOR = new Creator<NewsModel>() {
        @Override
        public NewsModel createFromParcel(Parcel in) {
            return new NewsModel(in);
        }

        @Override
        public NewsModel[] newArray(int size) {
            return new NewsModel[size];
        }
    };
    private String text;
    private String image;
    private String content;

    public NewsModel(String text, String image, String content) {
        this.text = text;
        this.image = image;
        this.content = content;
    }

    protected NewsModel(Parcel in) {
        text = in.readString();
        image = in.readString();
        content = in.readString();
    }

//    @BindingAdapter({"android:src"})
//    public static void loadImage(SquareImageView view, String imageUrl) {
//        Picasso.with(view.getContext())
//                .load(imageUrl)
//                .into(view);
//    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return image;
    }

    public String getContent() {
        return content;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(text);
        dest.writeString(image);
        dest.writeString(content);
    }
}
