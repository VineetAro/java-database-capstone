# User Stories for Appointment Scheduling System

This document outlines the user stories for the Appointment Scheduling System, categorized by user role: Admin, Patient, and Doctor.

---

## Admin User Stories

As an Admin, I want to:

* **Manage User Accounts:**
    * **As an Admin, I want to be able to create new user accounts (Doctor, Patient) so that I can onboard new users to the system.**
    * **As an Admin, I want to be able to view a list of all user accounts so that I can keep track of who is registered.**
    * **As an Admin, I want to be able to edit user account details (e.g., name, email, role) so that I can correct information or update user profiles.**
    * **As an Admin, I want to be able to deactivate or delete user accounts so that I can remove users who no longer need access.**
    * **As an Admin, I want to be able to reset user passwords so that I can help users regain access if they forget their credentials.**
* **Manage System Settings:**
    * **As an Admin, I want to be able to configure general system settings (e.g., working hours, default appointment duration) so that the system operates according to organizational policies.**
    * **As an Admin, I want to be able to view system logs and audit trails so that I can monitor system activity and troubleshoot issues.**
* **Manage Doctor Specializations/Services:**
    * **As an Admin, I want to be able to add new doctor specializations (e.g., Cardiology, Dermatology) so that patients can filter doctors by their area of expertise.**
    * **As an Admin, I want to be able to edit or remove existing doctor specializations so that the list of services remains current.**
* **Oversee Appointments (High-Level):**
    * **As an Admin, I want to be able to view all appointments across the system so that I can get an overall picture of scheduled activities.**
    * **As an Admin, I want to be able to cancel any appointment so that I can handle exceptional circumstances or system errors.**

---

## Patient User Stories

As a Patient, I want to:

* **User Registration & Login:**
    * **As a Patient, I want to be able to register for a new account so that I can access the appointment scheduling features.**
    * **As a Patient, I want to be able to log in to my account so that I can manage my appointments and profile.**
    * **As a Patient, I want to be able to recover my password if I forget it so that I can regain access to my account.**
* **Browse and Select Doctors:**
    * **As a Patient, I want to be able to search for doctors by name, specialization, or availability so that I can find a suitable doctor for my needs.**
    * **As a Patient, I want to be able to view doctor profiles, including their specialization, qualifications, and availability, so that I can make an informed decision.**
* **Book Appointments:**
    * **As a Patient, I want to be able to see available time slots for a chosen doctor so that I can select a convenient time for my appointment.**
    * **As a Patient, I want to be able to book an appointment with a chosen doctor and time slot so that I can secure my visit.**
    * **As a Patient, I want to receive a confirmation of my booked appointment so that I know my appointment is successfully scheduled.**
* **Manage Appointments:**
    * **As a Patient, I want to be able to view a list of my upcoming appointments so that I can keep track of my schedule.**
    * **As a Patient, I want to be able to reschedule an existing appointment so that I can adjust my schedule if needed.**
    * **As a Patient, I want to be able to cancel an existing appointment so that I can free up the time slot if I can no longer attend.**
    * **As a Patient, I want to receive reminders for my upcoming appointments so that I don't miss them.**
* **Manage Profile:**
    * **As a Patient, I want to be able to view and edit my personal profile information (e.g., name, contact details) so that my information is up-to-date.**

---

## Doctor User Stories

As a Doctor, I want to:

* **User Login:**
    * **As a Doctor, I want to be able to log in to my account so that I can manage my availability and appointments.**
* **Manage Availability:**
    * **As a Doctor, I want to be able to set my working hours and days so that patients can only book appointments when I am available.**
    * **As a Doctor, I want to be able to block out specific time slots (e.g., for breaks, meetings, or personal appointments) so that I can manage my non-appointment time.**
    * **As a Doctor, I want to be able to set my vacation or out-of-office periods so that patients cannot book appointments when I am unavailable for an extended time.**
* **Manage Appointments:**
    * **As a Doctor, I want to be able to view a daily, weekly, or monthly schedule of my upcoming appointments so that I can plan my day effectively.**
    * **As a Doctor, I want to be able to view details of each patient's appointment (e.g., patient name, reason for visit) so that I can prepare for the consultation.**
    * **As a Doctor, I want to be able to confirm or reject appointment requests (if the system supports requests rather than direct booking) so that I have control over my schedule.**
    * **As a Doctor, I want to be able to reschedule an appointment with a patient so that I can adjust for unforeseen circumstances.**
    * **As a Doctor, I want to be able to cancel an appointment with a patient and provide a reason so that the patient is informed.**
    * **As a Doctor, I want to be able to add notes to a patient's appointment record so that I can keep track of relevant information.**
* **Manage Profile:**
    * **As a Doctor, I want to be able to view and edit my professional profile (e.g., specialization, qualifications, contact information) so that patients can see accurate details.**