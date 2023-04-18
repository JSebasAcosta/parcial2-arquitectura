# parcial2-arquitectura
Parcial Diseño y Arquitectura de software
https://docs.google.com/document/d/1zgulWGKLq_MqSBgpuPRbJfQXyeLM8oOXEiaVdCvMKnI/edit?usp=sharing


Para correr el proyecto:

PS C:\Users\otero\Desktop\AS\Yop\Parcial2\parcial2-arquitectura> Docker build -t src .
[+] Building 0.9s (9/9) FINISHED
 => [internal] load build definition from Dockerfile                                                               0.0s
 => => transferring dockerfile: 155B                                                                               0.0s
 => [internal] load .dockerignore                                                                                  0.0s
 => => transferring context: 2B                                                                                    0.0s
 => [internal] load metadata for docker.io/library/centos:7.9.2009                                                 0.5s
 => [internal] load build context                                                                                  0.0s
 => => transferring context: 13.49kB                                                                               0.0s
 => [1/4] FROM docker.io/library/centos:7.9.2009@sha256:be65f488b7764ad3638f236b7b515b3678369a5124c47b8d32916d648  0.0s
 => CACHED [2/4] RUN yum install httpd -y                                                                          0.0s
 => CACHED [3/4] WORKDIR /var/www/html                                                                             0.0s
 => [4/4] COPY src .                                                                                               0.1s
 => exporting to image                                                                                             0.1s
 => => exporting layers                                                                                            0.1s
 => => writing image sha256:b9ab3aee19551a61cf63dc240689996def0c6e1183049b023e4563d1ee2ac581                       0.0s
 => => naming to docker.io/library/src                                                                             0.0s
PS C:\Users\otero\Desktop\AS\Yop\Parcial2\parcial2-arquitectura> Docker run -d -p 9100:80 src
3eda52ed175f4b9f087c8e9a7ec840694f241608328edcd76462993b25bc4ddc
PS C:\Users\otero\Desktop\AS\Yop\Parcial2\parcial2-arquitectura>
