package com.example.nasastructure.ui.theme.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.nasastructure.data.models.Item
import com.example.nasastructure.data.models.UsersRepository

class LoginViewModel(private val usersRepository: UsersRepository) : ViewModel(){

    var userUiState by mutableStateOf(UserUiState())
        private set

    fun updateUiState(userDetails: UserDetails){
        userUiState = UserUiState(userDetails = userDetails, isEntryValid = validateInput(userDetails))
    }
    suspend fun saveItem(){
        if(validateInput()){
            usersRepository.insertItem(userUiState.userDetails.toItem())
        }
    }

    private fun validateInput(uiState: UserDetails = userUiState.userDetails ): Boolean{
        return with(uiState){
            name.isNotBlank() && email.isNotBlank() && password.isNotBlank()
        }
    }

}
    fun UserDetails.toItem(): Item = Item(
        id = id,
        name = name,
        email = email,
        password = password
    )

    fun Item.toItemUiState(isEntryValid: Boolean = false): UserUiState = UserUiState(
        userDetails = this.toItemDetails(),
        isEntryValid = isEntryValid
    )
    fun Item.toItemDetails(): UserDetails = UserDetails(
        id = id,
        name = name,
        email = email,
        password = password
    )

    data class UserUiState(
        val userDetails: UserDetails = UserDetails(),
        val isEntryValid: Boolean = false
    )

    data class UserDetails(
        val id: Int = 0,
        val name: String = "",
        val email: String = "",
        val password: String= ""
    )