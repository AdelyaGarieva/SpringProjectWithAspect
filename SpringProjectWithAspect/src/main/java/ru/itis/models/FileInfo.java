package ru.itis.models;

import lombok.*;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileInfo {

    private Long id;
    // название файла в хранилище
    private String storageFileName;
    // название файла оригинальное
    private String originalFileName;
    // размер файла
    private Long size;
    // тип файла (MIME)
    private String type;
    // по какому URL можно получить файл
    private String url;
    // id пользователя
    private Long userId;
}
