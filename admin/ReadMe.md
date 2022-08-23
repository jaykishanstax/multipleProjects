Command to execute docker image build create.

###Commands
To build docker image:

`docker build -t admin-0.0.1-SNAPSHOT.jar`

To Check Docker image:

`docker image ls`
 this will open list of Repository with Tag, Image ID, Created, Size information

To run docker image.

`docker run -p 9090:8090 admin-0.0.1-SNAPSHOT.jar`


- Create account in dockerhub to push on it
- On docker command line 
  - `docker login` to login with same username and password ans dockerhub
  - `docker image ls`  to view if it exist
  - `docker tag admin-0.0.1-SNAPSHOT.jar dockerId/admin-0.0.1-SNAPSHOT.jar `  tag is added with respect to this is belong to given dockerid
  - `docker image ls` to verify tag is added
  - `docker push dockerId/admin-0.0.1-SNAPSHOT.jar`  push it on repo under your docker id, it will take time
  - `docker pull dockerid/admin-0.0.1-SNAPSHOT.jar`  to pull image from repo -- you can copy command from UI also
  - By adding docker-maven plugin we can push it to repo directly using maven install
  - 




