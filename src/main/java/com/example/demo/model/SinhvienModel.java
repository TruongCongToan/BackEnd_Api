package com.example.demo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinhvienModel {
	private int id;
	private String hodem;
	private String ten;
	private Date dob;
	private String gioitinh;
	private String tinh;
	private String malop;
	private String masv;
}
