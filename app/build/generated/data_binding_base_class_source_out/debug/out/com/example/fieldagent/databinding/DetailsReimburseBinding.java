// Generated by view binder compiler. Do not edit!
package com.example.fieldagent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fieldagent.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DetailsReimburseBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageButton Reject;

  @NonNull
  public final TextView amountTextView;

  @NonNull
  public final TextView expenseNameTextView;

  @NonNull
  public final TextView numberOfDaysTextView;

  @NonNull
  public final TextView receivingBillTextView;

  private DetailsReimburseBinding(@NonNull MaterialCardView rootView, @NonNull ImageButton Reject,
      @NonNull TextView amountTextView, @NonNull TextView expenseNameTextView,
      @NonNull TextView numberOfDaysTextView, @NonNull TextView receivingBillTextView) {
    this.rootView = rootView;
    this.Reject = Reject;
    this.amountTextView = amountTextView;
    this.expenseNameTextView = expenseNameTextView;
    this.numberOfDaysTextView = numberOfDaysTextView;
    this.receivingBillTextView = receivingBillTextView;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DetailsReimburseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DetailsReimburseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.details_reimburse, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DetailsReimburseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Reject;
      ImageButton Reject = ViewBindings.findChildViewById(rootView, id);
      if (Reject == null) {
        break missingId;
      }

      id = R.id.amountTextView;
      TextView amountTextView = ViewBindings.findChildViewById(rootView, id);
      if (amountTextView == null) {
        break missingId;
      }

      id = R.id.expenseNameTextView;
      TextView expenseNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (expenseNameTextView == null) {
        break missingId;
      }

      id = R.id.numberOfDaysTextView;
      TextView numberOfDaysTextView = ViewBindings.findChildViewById(rootView, id);
      if (numberOfDaysTextView == null) {
        break missingId;
      }

      id = R.id.receivingBillTextView;
      TextView receivingBillTextView = ViewBindings.findChildViewById(rootView, id);
      if (receivingBillTextView == null) {
        break missingId;
      }

      return new DetailsReimburseBinding((MaterialCardView) rootView, Reject, amountTextView,
          expenseNameTextView, numberOfDaysTextView, receivingBillTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
