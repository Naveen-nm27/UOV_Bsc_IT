<?php
session_start();
require "db.php"; 

if (!isset($_SESSION['user'])) { die("Not logged in."); }
$user = $_SESSION['user'];

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    // 1. CHECK CSRF TOKEN
    if (!isset($_POST['csrf_token']) || $_POST['csrf_token'] !== $_SESSION['csrf_token']) {
        // --- VISUAL: ATTACK BLOCKED ---
        echo "<body style='background-color: #e8f5e9; font-family: sans-serif; text-align: center; padding: 50px;'>
                <div style='background: white; border: 5px solid green; padding: 40px; display: inline-block;'>
                    <h1 style='color: green;'>🛡️ ATTACK BLOCKED!</h1>
                    <p>The form submission was blocked because the <strong>CSRF Token was missing</strong>.</p>
                    <p>Your money is safe.</p>
                    <a href='transfer.php'>Return to Dashboard</a>
                </div>
              </body>";
        exit;
    }

    // --- IF WE GET HERE, THE REQUEST IS VALID ---

    $amount = $_POST['amount'];
    $to_user = $_POST['to_user'];

    // Check balance
    $stmt = $pdo->prepare("SELECT balance FROM accounts WHERE username = ?");
    $stmt->execute([$user]);
    $sender_balance = $stmt->fetchColumn();

    if ($sender_balance < $amount) { die("Insufficient funds."); }

    // Execute Transfer
    $pdo->prepare("UPDATE accounts SET balance = balance - ? WHERE username = ?")->execute([$amount, $user]);
    $pdo->prepare("UPDATE accounts SET balance = balance + ? WHERE username = ?")->execute([$amount, $to_user]);

    // --- VISUAL: SUCCESSFUL LEGITIMATE TRANSFER ---
    echo "<body style='font-family: sans-serif; text-align: center; padding: 50px;'>
            <div style='border: 1px solid #ccc; padding: 20px; display: inline-block;'>
                <h2 style='color: #27ae60;'>✔ Transfer Complete</h2>
                <p>Sent $$amount to <strong>$to_user</strong>.</p>
                <a href='transfer.php'>Back</a>
            </div>
          </body>";
}
?>