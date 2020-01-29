package main.topic;

import java.util.List;

public interface TopicService {

	public List<Topic> getAllTopics();
	
	public Topic getTopic(int id);
	
	public void addTopic(Topic topic);
	
	public void updateTopic(Topic topic, int id);
	
	public void deleteTopic(int id);
}
