# Nguyễn Tâm Tú - 21081521

## 1. Kiểm tra phiên bản Docker
```
docker --version
```
Docker sẽ hiển thị phiên bản hiện tại nếu đã được cài đặt thành công.
![img.png](img.png)
---
## 2. Chạy thử một container mẫu
```
docker run hello-world
```
Chạy container `hello-world`, kiểm tra xem Docker có hoạt động bình thường không.
![img_1.png](img_1.png)
---
## 3. Tải image từ Docker Hub
```
docker pull nginx
```
Tải image `nginx` từ Docker Hub về máy.
![img_2.png](img_2.png)
---
## 4. Hiển thị danh sách images
```
docker images
```
Xem danh sách các images đã tải về máy.
![img_3.png](img_3.png)
---
## 5. Chạy container ở chế độ nền
```
docker run -d nginx
```
Chạy container từ image `nginx` trong chế độ nền (detached mode).
![img_4.png](img_4.png)
---
## 6. Xem danh sách container đang chạy
```
docker ps
```
Hiển thị các container đang chạy.
![img_4.png](img_4.png)

---
## 7. Xem danh sách tất cả container
```
docker ps -a
```
Liệt kê tất cả container, bao gồm cả những container đã dừng.
![img_5.png](img_5.png)
---
## 8. Xem logs của container
```
docker logs <container_id>
```
Xem log hoạt động của container.
![img_6.png](img_6.png)
---
## 9. Truy cập vào bên trong container
```
docker exec -it <container_id> /bin/sh
```
Mở terminal trong container để thực hiện các lệnh bên trong.
![img_7.png](img_7.png)
---
## 10. Dừng container
```
docker stop <container_id>
```
Dừng một container đang chạy.
![img_8.png](img_8.png)
---
## 11. Khởi động lại container
```
docker restart <container_id>
```
Khởi động lại container.
![img_9.png](img_9.png)
---
## 12. Xóa container
```
docker rm <container_id>
```
Xóa container đã dừng.
![img_10.png](img_10.png)
---
## 13. Xóa tất cả container đã dừng
```
docker container prune
```
Xóa tất cả container không còn sử dụng.
![img_11.png](img_11.png)
---
## 14. Xóa image
```
docker rmi <image_id>
```
Xóa một image khỏi hệ thống.
![img_12.png](img_12.png)
---
## 15. Xóa tất cả images không sử dụng
```
docker image prune -a
```
Dọn dẹp tất cả images không sử dụng.
![img_13.png](img_13.png)
---
## 16. Chạy container và ánh xạ cổng
```
docker run -d -p 8080:80 nginx
```
Chạy `nginx` và ánh xạ cổng 8080 của máy chủ với cổng 80 của container.
![img_14.png](img_14.png)
![img_15.png](img_15.png)
---
## 17. Xem thông tin container
```
docker inspect <container_id>
```
Hiển thị thông tin chi tiết của container.
![img_16.png](img_16.png)
---
## 18. Gắn volume vào container
```
docker run -d -v mydata:/data nginx
```
Gắn volume `mydata` vào container tại `/data`.
![img_17.png](img_17.png)
---
## 19. Liệt kê các volumes
```
docker volume ls
```
Hiển thị danh sách các volumes có trong hệ thống.
![img_18.png](img_18.png)
![img_19.png](img_19.png)
---
## 20. Xóa các volumes không sử dụng
```
docker volume prune
```
Dọn dẹp tất cả volumes không còn được sử dụng.
![img_20.png](img_20.png)
---
## 21. Chạy container với tên cụ thể
```
docker run -d --name my_nginx nginx
```
Tạo container `nginx` với tên `my_nginx`.
![img_21.png](img_21.png)
---
## 22. Theo dõi tài nguyên của container
```
docker stats
```
Xem thông tin tài nguyên (CPU, RAM, I/O) của các container đang chạy.
![img_22.png](img_22.png)
---
## 23. Liệt kê các mạng Docker
```
docker network ls
```
Hiển thị danh sách mạng trong Docker.
![img_23.png](img_23.png)
---
## 24. Tạo mạng Docker mới
```
docker network create my_network
```
Tạo một mạng Docker có tên `my_network`.
![img_24.png](img_24.png)
---
## 25. Chạy container trong một mạng cụ thể
```
docker run -d --network my_network --name my_container nginx
```
Chạy container `nginx` trong mạng `my_network`.
![img_25.png](img_25.png)
---
## 26. Kết nối container với mạng Docker
```
docker network connect my_network my_nginx
```
Kết nối container `my_nginx` vào mạng `my_network`.
![img_26.png](img_26.png)
---
## 27. Chạy container với biến môi trường
```
docker run -d -e MY_ENV=hello_world nginx
```
Tạo container với biến môi trường `MY_ENV` có giá trị `hello_world`.
![img_27.png](img_27.png)
---
## 28. Theo dõi logs của container
```
docker logs -f my_nginx
```
Theo dõi log của container `my_nginx` theo thời gian thực.
![img_28.png](img_28.png)
---
## 29. Viết Dockerfile
```
FROM nginx
COPY index.html /usr/share/nginx/html/index.html
```
Tạo một Dockerfile để build một image mới với file `index.html`.
![img_29.png](img_29.png)
---
## 30. Build image từ Dockerfile
```
docker build -t my_nginx_image .
```
Build một image mới có tên `my_nginx_image` từ Dockerfile.
![img_30.png](img_30.png)
---
## 31. Chạy container từ image đã build
```
docker run -d -p 8080:80 my_nginx_image
```
Chạy container từ image `my_nginx_image` và ánh xạ cổng 8080.
![img_31.png](img_31.png)


---

