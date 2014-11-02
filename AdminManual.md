Administration manual
=====================

Add user to Ubuntu
------------------

To add user to the server you need to

* sudo useradd -m newuser
* sudo passwd newuser

To get root accsess
* sudo su -

Install Git
-----------
To install git you need to do the following:

* sudo apt-get install git
* Clone this repository

Instal Java Development Kit
---------------------------

To install java 1.7.0 you need to do the following

* sudo apt-get install openjdk-7jdk

Install Gradle 
--------------

To install gradle 2.1 you need to do the following. Be sure that you have gradle 2.1 not 1.4 which
is by default when you do apt-get gradle

* sudo apt-get install software-propertiese-common
* sudo add-apt-repository ppa:cwchien/gradle
* sudo apt-get update
* sudo apt-get install gradle
