INSERT INTO post (id, text, username) VALUES
  (1, 'lorem ipsum', 'Gupta'),
  (4, 'nochmal', 'nein'),
  (8, 'blablabla', 'hanswurst');

INSERT INTO comment (id, post_Id, text, username) VALUES
  (1, 2, 'lorem ipsum', 'Gupta'),
  (2, 3, 'blablabla', 'hanswurst'),
  (4, 8, 'Julia', 'jajaja');

