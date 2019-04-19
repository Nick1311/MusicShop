package com.example.strona.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService
{
	@Autowired
	private TopicRepository topicRepository;
	
//    private List<Guitar> topics = Arrays.asList(
//            new Guitar("000", "Stratocaster 1968", "12000"),
//            new Guitar("001", "Jaguar 1980", "17000"),
//            new Guitar("002", "Les Paul 2009", "11000")
//            );

    public List<Topic> getAllTopics()
    {
//        return topics;
    	
    	List <Topic> topics = new ArrayList<>();
    	topicRepository.findAll()
    	.forEach(topics::add);
    	return topics;
    	
//    	return (List<Guitar>) topicRepository.findAll();﻿
    }

    public Topic getTopic(String id)
    {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//    	return topicRepository.findById(id);
    	
    	Topic t = topicRepository.findById(id).get(); return t;
    }
    
    public void addTopic(Topic topic)
    {
//        topics.add(topic);
    	topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic)
    {
//        for (int i=0; i<topics.size(); i++)
//        {
//            Guitar t = topics.get(i);
//            if(t.getId().equals(id))
//            {
//                topics.set(i, topic);
//                return;
//            }
//        }
    	topicRepository.save(topic);
    }

    public void deleteTopic(String id)
    {
//        topics.removeIf(t -> t.getId().equals(id));
    	topicRepository.deleteById(id);
    	
    }
}
