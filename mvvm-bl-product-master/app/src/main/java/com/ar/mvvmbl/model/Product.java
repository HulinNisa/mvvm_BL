package com.ar.mvvmbl.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by RadyaLabs PC on 11/10/2017.
 */

@NoArgsConstructor
@Data
public class Product implements Serializable{

    public String status;
    private List<Products> products;

    public String getStatus() {
        return status;
    }

    public List<Products> getProducts() {
        return products;
    }


    @NoArgsConstructor
    @Data
    public static class Products implements Serializable {

        private long price;
        private String id;
        private String name;
        private String desc;
        private List<String> images;

        public String getName() {
            return name;
        }

        public long getPrice() {
            return price;
        }

        public String getDesc() {
            return desc;
        }

        public List<String> getImages() {
            return images;
        }

        public String getId() {
            return id;
        }
    }

}
