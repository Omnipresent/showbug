1. Login - Copy the access_token for future curl requests

curl -X POST -H "Content-Type: application/json" -H "Cache-Control: no-cache" -d '{"username":"tester@gmail.com", "password": "password123!"}' "http://localhost:8080/api/login"

2. Save - POST Do this 3 or 4 times to save multiple records

curl -X POST -H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJwcmluY2lwYWwiOiJINHNJQUFBQUFBQUFBSlZTUFU4YlFSUjhaNHdJUWdvbVVpS2xnQ2FrUTJjcEtkMGtJQWNwT2htRWNVT2tvUFhkNDdLd3QzdnM3b0hkSUZkUXVBRHhJU0hsTFwvQlBTSk1mRUlXQ2xqcHQzaDZZTXpTSXJlN2V6czNNbTdtTEd4ZzFHajdHbW5GaFwvRlJrTVplK1NUV1hzY0V3MDl4MlwvY3lnanREbWlNVWMyS0lKM0I2dkJGNEFKUjVaZUJWc3NoMVdGVXpHMWFYMkpvYTIxdEh3UWVuNGpuRkRzd1IzbGQ3eTc3bERwZkdCUUVIdEhaVmdiQTJtV0JpcVROcUdrdlZPeWpWR2ExQXBab0VLdDl6b2RVZzNLQzFud2d4RHgxQ3l0c0FvZ0FtVzJSK0tWRGthQzVPM1pqUExSYldKdGhiQWk1UVpRKzRlYmRLMHpycTdkellsYmJBTmUxRHVwQjRkeXU2OWdcL3FPeDE5UVF0RFdYRWt6MjVLSml2Z0dkK0xFMzVzK1wvbjM0czljcUFWQW1jMDlcL1U4emZ6a1B2OHZ1XC9tVHhvTDdUd1pzaDZBYXQxVW5JelZUQ3ZhblRLZjg2WFQ4NXVEcjZOa0xKRGZIbCtIN09mNzVMckxxZ2taWnBaTmRRUjBlNlczVE9Seno5TlBtaWg2emQ1a2dxa1AwcGFqTzRsQ21KYXQ2eVZHT1J0WVh4bEthaXZ0NXIxRmZkV3NkUWo2azl4UWthSk95SDlsXC9uNnJqY1wvVU5SYVwvXC9ybzErRzd2OFQxRlVaM21NaVEwcThVb0VhV3RGSHZYNXhOVDV4ZTlmTmRCdlwvMWY3YlNyT29iQXdBQSIsInN1YiI6InRlc3RlckBnbWFpbC5jb20iLCJyb2xlcyI6WyJST0xFX1VTRVIiXSwiZXhwIjoxNDU3NzkyMDgyLCJpYXQiOjE0NTc3ODg0ODJ9.HBTKbXOJ8wXpzmUWvBhSXw-SD2H0K7D9lEnv8mGd440" -H "Content-Type: application/json" -H "Cache-Control: no-cache" -d '{"name":"Test enclave"}' "http://localhost:8080/api/enclaves"

3. index - GET Show all saved records

`curl -X GET -H "Content-Type: application/json" -H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJwcmluY2lwYWwiOiJINHNJQUFBQUFBQUFBSlZTUFU4YlFSUjhaNHdJUWdvbVVpS2xnQ2FrUTJjcEtkMGtJQWNwT2htRWNVT2tvUFhkNDdLd3QzdnM3b0hkSUZkUXVBRHhJU0hsTFwvQlBTSk1mRUlXQ2xqcHQzaDZZTXpTSXJlN2V6czNNbTdtTEd4ZzFHajdHbW5GaFwvRlJrTVplK1NUV1hzY0V3MDl4MlwvY3lnanREbWlNVWMyS0lKM0I2dkJGNEFKUjVaZUJWc3NoMVdGVXpHMWFYMkpvYTIxdEh3UWVuNGpuRkRzd1IzbGQ3eTc3bERwZkdCUUVIdEhaVmdiQTJtV0JpcVROcUdrdlZPeWpWR2ExQXBab0VLdDl6b2RVZzNLQzFud2d4RHgxQ3l0c0FvZ0FtVzJSK0tWRGthQzVPM1pqUExSYldKdGhiQWk1UVpRKzRlYmRLMHpycTdkellsYmJBTmUxRHVwQjRkeXU2OWdcL3FPeDE5UVF0RFdYRWt6MjVLSml2Z0dkK0xFMzVzK1wvbjM0czljcUFWQW1jMDlcL1U4emZ6a1B2OHZ1XC9tVHhvTDdUd1pzaDZBYXQxVW5JelZUQ3ZhblRLZjg2WFQ4NXVEcjZOa0xKRGZIbCtIN09mNzVMckxxZ2taWnBaTmRRUjBlNlczVE9Seno5TlBtaWg2emQ1a2dxa1AwcGFqTzRsQ21KYXQ2eVZHT1J0WVh4bEthaXZ0NXIxRmZkV3NkUWo2azl4UWthSk95SDlsXC9uNnJqY1wvVU5SYVwvXC9ybzErRzd2OFQxRlVaM21NaVEwcThVb0VhV3RGSHZYNXhOVDV4ZTlmTmRCdlwvMWY3YlNyT29iQXdBQSIsInN1YiI6InRlc3RlckBnbWFpbC5jb20iLCJyb2xlcyI6WyJST0xFX1VTRVIiXSwiZXhwIjoxNDU3NzkyMDgyLCJpYXQiOjE0NTc3ODg0ODJ9.HBTKbXOJ8wXpzmUWvBhSXw-SD2H0K7D9lEnv8mGd440" -H "Cache-Control: no-cache"  "http://localhost:8080/api/enclaves"`

4. show - GET show record with id 3 - This shows an error

`curl -X GET -H "Content-Type: application/json" -H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJwcmluY2lwYWwiOiJINHNJQUFBQUFBQUFBSlZTUFU4YlFSUjhaNHdJUWdvbVVpS2xnQ2FrUTJjcEtkMGtJQWNwT2htRWNVT2tvUFhkNDdLd3QzdnM3b0hkSUZkUXVBRHhJU0hsTFwvQlBTSk1mRUlXQ2xqcHQzaDZZTXpTSXJlN2V6czNNbTdtTEd4ZzFHajdHbW5GaFwvRlJrTVplK1NUV1hzY0V3MDl4MlwvY3lnanREbWlNVWMyS0lKM0I2dkJGNEFKUjVaZUJWc3NoMVdGVXpHMWFYMkpvYTIxdEh3UWVuNGpuRkRzd1IzbGQ3eTc3bERwZkdCUUVIdEhaVmdiQTJtV0JpcVROcUdrdlZPeWpWR2ExQXBab0VLdDl6b2RVZzNLQzFud2d4RHgxQ3l0c0FvZ0FtVzJSK0tWRGthQzVPM1pqUExSYldKdGhiQWk1UVpRKzRlYmRLMHpycTdkellsYmJBTmUxRHVwQjRkeXU2OWdcL3FPeDE5UVF0RFdYRWt6MjVLSml2Z0dkK0xFMzVzK1wvbjM0czljcUFWQW1jMDlcL1U4emZ6a1B2OHZ1XC9tVHhvTDdUd1pzaDZBYXQxVW5JelZUQ3ZhblRLZjg2WFQ4NXVEcjZOa0xKRGZIbCtIN09mNzVMckxxZ2taWnBaTmRRUjBlNlczVE9Seno5TlBtaWg2emQ1a2dxa1AwcGFqTzRsQ21KYXQ2eVZHT1J0WVh4bEthaXZ0NXIxRmZkV3NkUWo2azl4UWthSk95SDlsXC9uNnJqY1wvVU5SYVwvXC9ybzErRzd2OFQxRlVaM21NaVEwcThVb0VhV3RGSHZYNXhOVDV4ZTlmTmRCdlwvMWY3YlNyT29iQXdBQSIsInN1YiI6InRlc3RlckBnbWFpbC5jb20iLCJyb2xlcyI6WyJST0xFX1VTRVIiXSwiZXhwIjoxNDU3NzkyMDgyLCJpYXQiOjE0NTc3ODg0ODJ9.HBTKbXOJ8wXpzmUWvBhSXw-SD2H0K7D9lEnv8mGd440" -H "Cache-Control: no-cache"  "http://localhost:8080/api/enclaves/3"`