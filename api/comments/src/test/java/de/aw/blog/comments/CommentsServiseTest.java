package de.aw.blog.comments;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class CommentsServiseTest {
	
	@Mock
	CommentsRepository commentsRepository;
	
	@InjectMocks
	CommentsService unitUnderTest;
	
	@DisplayName("When /api/posts/1/comments is called Then 3 comments are returned")
	@Test
	public void returnComments() {
		
		when(commentsRepository.findAll()).thenReturn(Arrays.asList(
				createComment(1),
		        createComment(1),
		        createComment(1),
		        createComment(2)
		         ));
		List<Comment>resultToCheck = unitUnderTest.getCommentsByPostId(1);
		assertThat(resultToCheck).hasSize(3);
	}
	
	private Comment createComment(long postId) {
		Comment comment =new Comment();
		comment.setId(423423434);
		comment.setPostId(postId);
		comment.setText("fggdfdg");
		comment.setUsername("Kasper Hauser");
		return comment;
	}

}
