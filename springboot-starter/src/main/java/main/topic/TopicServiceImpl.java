package main.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Transactional
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	@Transactional
	public Topic getTopic(int id) {
		return topicRepository.findOne(id);
	}
	
	@Transactional
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	@Transactional
	public void updateTopic(Topic topic, int id) {
		topicRepository.save(topic);
	}

	@Transactional
	public void deleteTopic(int id) {
		topicRepository.delete(id);
	}
}
