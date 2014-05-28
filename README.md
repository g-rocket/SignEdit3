SignEdit3
=========

* SignEdit3 is a bukkit plugin that makes it possible to edit signs using the vanilla sign GUI.  
* When you right-click a sign while holding a sign in your hand, it edits the sign.  
  You can shift+right-click to place a sign against a sign.  
* It works by sending a “open sign GUI” packet to the client whenever you need to edit a sign.  
* It requires a build of bukkit/craftbukkit with pull requests 1038/1345 respectively merged in to work.  
  I included such a build in the "special bukkit & craftbukkit" folder.  
* It can be built by invoking `mvn package`
