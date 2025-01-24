# Coupon-Mgmt-System

## Function Analysis
This project is a **Coupon Distribution Platform** designed for both consumers and merchants. Customers can easily manage their coupons, while merchants can distribute them directly through the platform.

To handle high traffic during limited amount of coupon releases, we use **Kafka** for real-time processing of large-scale messages. **HBase** ensures efficient storage and high-performance read/write operations for customer information. **Redis** is used as a caching layer to reduce database load and accelerate coupon retrieval processes.

The platform will be tested using **Postman** for API functionality.

## Tools
- Backend Framework: SpringBoot
- Tools: Kafka, HBase, Maven, JDK8
- Cache: Redis


