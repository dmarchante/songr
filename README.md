# Songr Application

  ## Main
    - [Songr Application](./src/main/java/com.dmarchante.code401d4.class12.songr/SongrApplication.java)
    - [Hello World Controller](./src/main/java/com.dmarchante.code401d4.class12.songr/HelloWorldController.java)
    - [Album](./src/main/java/com.dmarchante.code401d4.class12.songr/Album.java)
    - [Album Controller](./src/main/java/com.dmarchante.code401d4.class12.songr/AlbumController.java)
    - [Album Repository](./src/main/java/com.dmarchante.code401d4.class12.songr/AlbumRepository.java)
    - [AlSongum](./src/main/java/com.dmarchante.code401d4.class12.songr/Song.java)
    - [Song Repository](./src/main/java/com.dmarchante.code401d4.class12.songr/SongRepository.java)
\
   ## Test
    - [Songr Application Tests](./src/main/java/com.dmarchante.code401d4.class12.songr/SongrApplicationTests.java)

  ## How to run

  In you terminal navigate to your desird directy then enter if you chooses to use ssh please consult the github webiste (https://help.github.com/en/articles/connecting-to-github-with-ssh):
  `https://github.com/dmarchante/songr.git`

  After cloning run the following command:
  `gradle bootRun`

  Then navigate to `localhost:8080/albums` it should just have a header

  ### How to add albums

  Navigate to `localhost:8080/albums/new` and fill in the form and hit submit

  ### How to add songs

  From `localhost:8080/albums` click the view deatails button and you will be able to add songs from this screen

