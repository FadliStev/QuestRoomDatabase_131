package com.example.actpertemuan7.repository

import com.example.actpertemuan7.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}