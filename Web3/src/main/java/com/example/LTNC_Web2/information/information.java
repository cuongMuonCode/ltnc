package com.example.LTNC_Web2.information;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "Information")
public class information {
    private Integer informationId;// luu id sinh vien
    private String name;
    private String email;
}
