package com.example.animequotes.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextUtils;

import android.widget.Toast;


import com.example.animequotes.R;
import com.google.android.material.textfield.TextInputLayout;
public class SignUp_fragment extends Fragment {

    private TextInputLayout firstNameLayout, lastNameLayout, emailLayout, passwordLayout, phoneNumberLayout;
    private EditText firstNameEditText, lastNameEditText,  emailEditText, passwordEditText, PhoneNumberEditText;
    private Button registerButton;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up_fragment, container, false);

        //
        firstNameLayout = view.findViewById(R.id.textInputLayout);
        lastNameLayout = view.findViewById(R.id.textInputLayout2);
        emailLayout = view.findViewById(R.id.textInputLayout3);
        passwordLayout = view.findViewById(R.id.textInputLayout4);
        phoneNumberLayout = view.findViewById(R.id.textInputLayout5);

        firstNameEditText = view.findViewById(R.id.register_firstname);
        lastNameEditText = view.findViewById(R.id.register_secondname);
        emailEditText = view.findViewById(R.id.register_email);
        passwordEditText = view.findViewById(R.id.register_password);
        PhoneNumberEditText = view.findViewById(R.id.register_phoneNumber);

        registerButton = view.findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateInput();
            }
        });
        return view;
    }

    private void validateInput() {
        boolean isValid = true;

        // Validate First Name
        if (TextUtils.isEmpty(firstNameEditText.getText())) {
            firstNameLayout.setError("First name is required");
            isValid = false;
        } else {
            firstNameLayout.setError(null);
        }

        // Validate Second Name
        if (TextUtils.isEmpty(lastNameEditText.getText())) {
            lastNameLayout.setError("Second name is required");
            isValid = false;
        } else {
            lastNameLayout.setError(null);
        }


        // Validate Email
        String email = emailEditText.getText().toString();
        if (TextUtils.isEmpty(email)) {
            emailLayout.setError("Email is required");
            isValid = false;
        } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailLayout.setError("Enter a valid email");
            isValid = false;
        } else {
            emailLayout.setError(null);
        }

        // Validate Password
        if (TextUtils.isEmpty(passwordEditText.getText())) {
            passwordLayout.setError("Password is required");
            isValid = false;
        } else if (passwordEditText.getText().length() < 6) {
            passwordLayout.setError("Password must be at least 6 characters long");
            isValid = false;
        } else {
            passwordLayout.setError(null);
        }

        // Validate Phone Number
        if (TextUtils.isEmpty(PhoneNumberEditText.getText())) {
            phoneNumberLayout.setError("Phone Number is required");
            isValid = false;
        } else if (PhoneNumberEditText.getText().length() != 11) {
            phoneNumberLayout.setError("Phone Number must be 11 characters long");
            isValid = false;
        } else {
            phoneNumberLayout.setError(null);
        }

        // If everything is valid
        if (isValid) {
            Toast.makeText(getActivity(), "Registration Successful", Toast.LENGTH_SHORT).show();
            // Create Intent and pass the first name
            Intent intent = new Intent(getActivity(), MainAnimes.class);
            intent.putExtra("firstName", firstNameEditText.getText().toString());
            startActivity(intent);


            // Optional: Clear the form fields after successful registration
            clearFormFields();
        }
    }

    private void clearFormFields() {
        firstNameEditText.setText("");
        lastNameEditText.setText("");
        emailEditText.setText("");
        passwordEditText.setText("");
        PhoneNumberEditText.setText("");
    }
}
