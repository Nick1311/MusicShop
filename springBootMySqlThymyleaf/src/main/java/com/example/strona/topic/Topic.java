package com.example.strona.topic;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import javax.swing.text.View;

@Entity
@Table(name="new_table")
public class Topic
{
	//@Autowired
//	private GuitarRepository topicRepository;
	
	@Id
   // Column(name="id")
    private String id;
   // Column(name="instrument")
    private String instrument;

   // private String price;

    public Topic()
    {

    }

    public Topic(String id, String instrument)
    {
        this.id = id;
        this.instrument = instrument;
        //this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

//    //public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
}
