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
public class ProductDetail implements Serializable{

    private String status;
    private Product product;

    public String getStatus() {
        return status;
    }

    public Product getProduct() {
        return product;
    }

    @NoArgsConstructor
    @Data
    public static class Product implements Serializable{

        private long price;
        private String id;
        private String desc;
        private List<String> images;
        private String name;
        private String nama;

        public long getPrice() {
            return price;
        }

        public String getNama() {
            return nama;
        }

        public List<String> getImages() {
            return images;
        }

        public String getDesc() {
            return desc;
        }
    }
}
