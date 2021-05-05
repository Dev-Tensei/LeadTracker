package com.bignerdranch.android.lead;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0004+,-.B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0016\u0010\'\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002R\u0014\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/bignerdranch/android/lead/LeadListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/bignerdranch/android/lead/LeadListFragment$LeadAdapter;", "callbacks", "Lcom/bignerdranch/android/lead/LeadListFragment$Callbacks;", "leadListViewModel", "Lcom/bignerdranch/android/lead/LeadListViewModel;", "getLeadListViewModel", "()Lcom/bignerdranch/android/lead/LeadListViewModel;", "leadListViewModel$delegate", "Lkotlin/Lazy;", "leadRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "updateUI", "leads", "", "Lcom/bignerdranch/android/lead/Lead;", "Callbacks", "Companion", "LeadAdapter", "LeadHolder", "app_debug"})
public final class LeadListFragment extends androidx.fragment.app.Fragment {
    private com.bignerdranch.android.lead.LeadListFragment.Callbacks callbacks;
    private androidx.recyclerview.widget.RecyclerView leadRecyclerView;
    private com.bignerdranch.android.lead.LeadListFragment.LeadAdapter adapter;
    private final kotlin.Lazy leadListViewModel$delegate = null;
    public static final com.bignerdranch.android.lead.LeadListFragment.Companion Companion = null;
    
    private final com.bignerdranch.android.lead.LeadListViewModel getLeadListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void updateUI(java.util.List<com.bignerdranch.android.lead.Lead> leads) {
    }
    
    public LeadListFragment() {
        super();
    }
    
    /**
     * Required interface for hosting activities
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/bignerdranch/android/lead/LeadListFragment$Callbacks;", "", "onLeadSelected", "", "leadId", "Ljava/util/UUID;", "app_debug"})
    public static abstract interface Callbacks {
        
        public abstract void onLeadSelected(@org.jetbrains.annotations.NotNull()
        java.util.UUID leadId);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/bignerdranch/android/lead/LeadListFragment$LeadHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lcom/bignerdranch/android/lead/LeadListFragment;Landroid/view/View;)V", "callBtn", "Landroid/widget/Button;", "getCallBtn", "()Landroid/widget/Button;", "dateTextView", "Landroid/widget/TextView;", "getDateTextView", "()Landroid/widget/TextView;", "itemBackground", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getItemBackground", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "lead", "Lcom/bignerdranch/android/lead/Lead;", "phoneTextView", "getPhoneTextView", "titleTextView", "getTitleTextView", "bind", "", "onClick", "v", "app_debug"})
    final class LeadHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private com.bignerdranch.android.lead.Lead lead;
        @org.jetbrains.annotations.NotNull()
        private final androidx.constraintlayout.widget.ConstraintLayout itemBackground = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView phoneTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView dateTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button callBtn = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.widget.ConstraintLayout getItemBackground() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPhoneTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDateTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getCallBtn() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.bignerdranch.android.lead.Lead lead) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public LeadHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/bignerdranch/android/lead/LeadListFragment$LeadAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bignerdranch/android/lead/LeadListFragment$LeadHolder;", "Lcom/bignerdranch/android/lead/LeadListFragment;", "leads", "", "Lcom/bignerdranch/android/lead/Lead;", "(Lcom/bignerdranch/android/lead/LeadListFragment;Ljava/util/List;)V", "getLeads", "()Ljava/util/List;", "setLeads", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
    final class LeadAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bignerdranch.android.lead.LeadListFragment.LeadHolder> {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<com.bignerdranch.android.lead.Lead> leads;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.bignerdranch.android.lead.LeadListFragment.LeadHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.bignerdranch.android.lead.LeadListFragment.LeadHolder holder, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.bignerdranch.android.lead.Lead> getLeads() {
            return null;
        }
        
        public final void setLeads(@org.jetbrains.annotations.NotNull()
        java.util.List<com.bignerdranch.android.lead.Lead> p0) {
        }
        
        public LeadAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<com.bignerdranch.android.lead.Lead> leads) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/bignerdranch/android/lead/LeadListFragment$Companion;", "", "()V", "newInstance", "Lcom/bignerdranch/android/lead/LeadListFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.bignerdranch.android.lead.LeadListFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}