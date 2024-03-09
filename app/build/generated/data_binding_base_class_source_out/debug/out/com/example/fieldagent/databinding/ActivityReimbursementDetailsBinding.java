// Generated by view binder compiler. Do not edit!
package com.example.fieldagent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fieldagent.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityReimbursementDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView reimbursementDetailsRecyclerView;

  private ActivityReimbursementDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView reimbursementDetailsRecyclerView) {
    this.rootView = rootView;
    this.reimbursementDetailsRecyclerView = reimbursementDetailsRecyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityReimbursementDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityReimbursementDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_reimbursement_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityReimbursementDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.reimbursementDetailsRecyclerView;
      RecyclerView reimbursementDetailsRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (reimbursementDetailsRecyclerView == null) {
        break missingId;
      }

      return new ActivityReimbursementDetailsBinding((ConstraintLayout) rootView,
          reimbursementDetailsRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
