FROM centos:7.9.2009

RUN yum install httpd -y

WORKDIR /var/www/html

COPY src .

CMD apachectl -D FOREGROUND