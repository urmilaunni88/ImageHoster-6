package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {

	@Autowired
	CommentsRepository commentsRepository;

	public Comment insertComment(Comment comment) {
		return commentsRepository.insertComment(comment);
	}

}


