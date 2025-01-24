# Coupon-Mgmt-System

## Function Analysis
This project is a **Coupon Distribution Platform** designed for both consumers and merchants. Customers can easily manage their coupons, while merchants can distribute them directly through the platform.

To handle high traffic during limited amount of coupon releases, we use **Kafka** for real-time processing of large-scale messages. **HBase** ensures efficient storage and high-performance read/write operations for customer information. **Redis** is used as a caching layer to reduce database load and accelerate coupon retrieval processes.

The platform will be tested using **Postman** for API functionality.

## Tools
- Backend Framework: SpringBoot
- Tools: Kafka, HBase(User Info), MySQL(Merchant Info), Maven, JDK8
- Cache: Redis

## Main Structure
- Cache Design
- Utility
- Log
- Exception
- DB

## Merchant System

### Function
- Create Merchant
- Release coupon

### Merchant Package
- constant -- constants definition
- security -- interceptor
- entity -- Merchant Entity Class
- dao -- Merchant Data Access Object Interface
- vo -- Value Object
- service -- Merchant service interface and implementation

## Customer System

### Function
- User - Coupon Function
  User get coupon
  User use coupon
  Get user's usable coupons
  Get user's used coupons
  Get user's all coupons
- Get Coupon Inventory
- Give Feedback



