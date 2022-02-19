package br.com.supera.game.store.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Product {

   @Id
   @GeneratedValue
   private Long id;
   private String name;
   private BigDecimal price;
   private Short score;
   private String image;

   public Product() {
   }

   public Product(Long id, String name, BigDecimal price, Short score, String image) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.score = score;
      this.image = image;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public BigDecimal getPrice() {
      return price;
   }

   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   public Short getScore() {
      return score;
   }

   public void setScore(Short score) {
      this.score = score;
   }

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image = image;
   }
}