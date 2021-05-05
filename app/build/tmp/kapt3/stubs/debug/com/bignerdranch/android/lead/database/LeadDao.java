package com.bignerdranch.android.lead.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0007H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/bignerdranch/android/lead/database/LeadDao;", "", "addLead", "", "lead", "Lcom/bignerdranch/android/lead/Lead;", "getLead", "Landroidx/lifecycle/LiveData;", "id", "Ljava/util/UUID;", "getLeads", "", "updateLead", "app_debug"})
public abstract interface LeadDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM lead")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.lead.Lead>> getLeads();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM lead WHERE id=(:id)")
    public abstract androidx.lifecycle.LiveData<com.bignerdranch.android.lead.Lead> getLead(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @androidx.room.Update()
    public abstract void updateLead(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.lead.Lead lead);
    
    @androidx.room.Insert()
    public abstract void addLead(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.lead.Lead lead);
}