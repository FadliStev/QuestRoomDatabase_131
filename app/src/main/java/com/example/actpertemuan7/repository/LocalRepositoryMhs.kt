package com.example.actpertemuan7.repository

import com.example.actpertemuan7.data.dao.MahasiswaDao
import com.example.actpertemuan7.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
       mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}