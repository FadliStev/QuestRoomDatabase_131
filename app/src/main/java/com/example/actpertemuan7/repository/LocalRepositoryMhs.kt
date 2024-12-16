package com.example.actpertemuan7.repository

import com.example.actpertemuan7.data.dao.MahasiswaDao
import com.example.actpertemuan7.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
       mahasiswaDao.insertMahasiswa(mahasiswa)
    }
    override fun getAllMhs(): Flow<List<Mahasiswa>>{
        return mahasiswaDao.getAllMahasiswa()
    }

    override fun getMhs(nim: String): Flow<Mahasiswa>{
        return mahasiswaDao.getMahasiswa(nim)
    }

    override suspend fun deleteMhs(mahasiswa: Mahasiswa) {
        return mahasiswaDao.deleteMahasiswa(mahasiswa)
    }

    override suspend fun updateMhs(mahasiswa: Mahasiswa) {
        return mahasiswaDao.updateMahasiswa(mahasiswa)
    }


}