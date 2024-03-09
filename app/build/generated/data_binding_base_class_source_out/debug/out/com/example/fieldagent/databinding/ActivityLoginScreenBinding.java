// Generated by view binder compiler. Do not edit!
package com.example.fieldagent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fieldagent.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText EmailET;

  @NonNull
  public final TextView createacount;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ImageButton loginButton;

  @NonNull
  public final EditText passET;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView7;

  private ActivityLoginScreenBinding(@NonNull ConstraintLayout rootView, @NonNull EditText EmailET,
      @NonNull TextView createacount, @NonNull ImageView imageView2,
      @NonNull LinearLayout linearLayout, @NonNull ImageButton loginButton,
      @NonNull EditText passET, @NonNull TextView textView3, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.EmailET = EmailET;
    this.createacount = createacount;
    this.imageView2 = imageView2;
    this.linearLayout = linearLayout;
    this.loginButton = loginButton;
    this.passET = passET;
    this.textView3 = textView3;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.EmailET;
      EditText EmailET = ViewBindings.findChildViewById(rootView, id);
      if (EmailET == null) {
        break missingId;
      }

      id = R.id.createacount;
      TextView createacount = ViewBindings.findChildViewById(rootView, id);
      if (createacount == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.loginButton;
      ImageButton loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.passET;
      EditText passET = ViewBindings.findChildViewById(rootView, id);
      if (passET == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new ActivityLoginScreenBinding((ConstraintLayout) rootView, EmailET, createacount,
          imageView2, linearLayout, loginButton, passET, textView3, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
