package test6.sub09;

import java.util.List;

public interface Commentable {
  void addComment(Comment comment);

  List<Comment> getComments();
}
