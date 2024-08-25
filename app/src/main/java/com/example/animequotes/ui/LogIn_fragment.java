package com.example.animequotes.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.example.animequotes.R;
import com.google.android.material.textfield.TextInputLayout;

public class LogIn_fragment extends Fragment {

    private TextInputLayout emailLayout, passwordLayout;
    private EditText emailEditText, passwordEditText;
    private Button loginButton;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_log_in_fragment, container, false);

        emailLayout = view.findViewById(R.id.textInputLayout5);
        passwordLayout = view.findViewById(R.id.textInputLayout4);

        emailEditText = view.findViewById(R.id.login_email);
        passwordEditText = view.findViewById(R.id.login_password);

        loginButton = view.findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput()) {
                    Toast.makeText(getActivity(), "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), LatestListFragment.class);
                    startActivity(intent);
                }
            }
        });

        return view;
    }
    private boolean validateInput() {
        boolean isValid = true;

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
        String password = passwordEditText.getText().toString();
        if (TextUtils.isEmpty(password)) {
            passwordLayout.setError("Password is required");
            isValid = false;
        } else if (password.length() < 6) {
            passwordLayout.setError("Password must be at least 6 characters long");
            isValid = false;
        } else {
            passwordLayout.setError(null);
        }

        return isValid;
    }
}
