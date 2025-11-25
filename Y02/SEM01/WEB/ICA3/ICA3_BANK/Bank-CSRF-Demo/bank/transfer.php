<?php
session_start();
require "db.php";

if (!isset($_SESSION['user'])) { header("Location: index.php"); exit; }
$user = $_SESSION['user'];

// Get current balance
$stmt = $pdo->prepare("SELECT balance FROM accounts WHERE username = ?");
$stmt->execute([$user]);
$balance = $stmt->fetchColumn();
?>
<!DOCTYPE html>
<html>
<head>
    <style>
        body { font-family: sans-serif; background: #f4f7f6; padding: 20px; }
        .card { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); max-width: 500px; margin: auto; }
        .balance { font-size: 48px; color: #2ecc71; font-weight: bold; }
        .btn { background: #3498db; color: white; border: none; padding: 10px 20px; cursor: pointer; font-size: 16px; border-radius: 5px;}
        input { padding: 10px; border: 1px solid #ddd; border-radius: 5px; width: 90%; }
    </style>
</head>
<body>

<div class="card">
    <h2>🏦 MyBank Dashboard</h2>
    <p>Welcome back, <?php echo htmlspecialchars($user); ?></p>
    
    <hr>
    <p>Available Balance:</p>
    <div class="balance">$<?php echo number_format($balance, 2); ?></div>
    <hr>

    <h3>Quick Transfer</h3>
    <form action="update_balance.php" method="POST">
        <label>Amount ($):</label><br>
        <input type="number" name="amount" required min="1" step="0.01"><br><br>

        <label>To (Username):</label><br>
        <input type="text" name="to_user" placeholder="e.g. landlord" required><br><br>

        <button type="submit" class="btn">Send Money</button>
    </form>
</div>

</body>
</html>