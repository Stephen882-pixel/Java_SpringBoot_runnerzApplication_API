# Runnerz - Java Spring Boot CRUD Application

## Overview

**Runnerz** is a simple CRUD application built with Java Spring Boot. It allows users to keep track of their runs by providing details such as the name of the run, start date, completion date, and miles covered. The application supports the following operations:
- Create a new run with details in JSON format.
- Retrieve run data from the API.
- Update an existing run.
- Delete a run.

## Features

- **Create a Run**: Submit details about your run via a JSON request. The application will store the following information:
  - Run ID
  - Name of the run
  - Start date (`startedOn`)
  - Completion date (`completedOn`)
  - Miles covered
  
- **Read a Run**: Retrieve details of a specific run or a list of all runs via API.

- **Update a Run**: Update the details of an existing run.

- **Delete a Run**: Remove a run from the system by providing its ID.

## Technologies Used

- Java
- Spring Boot
- Maven (for project management)
- H2 (or MySQL/PostgreSQL depending on your setup)
- RESTful API

## Installation and Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Stephen882-pixel/Java_SpringBoot_runnerzApplication_API
