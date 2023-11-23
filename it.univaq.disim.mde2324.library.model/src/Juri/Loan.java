/**
 */
package Juri;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Juri.Loan#getBook <em>Book</em>}</li>
 *   <li>{@link Juri.Loan#getMember <em>Member</em>}</li>
 *   <li>{@link Juri.Loan#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see Juri.JuriPackage#getLoan()
 * @model
 * @generated
 */
public interface Loan extends EObject {
	/**
	 * Returns the value of the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' reference.
	 * @see #setBook(Book)
	 * @see Juri.JuriPackage#getLoan_Book()
	 * @model required="true"
	 * @generated
	 */
	Book getBook();

	/**
	 * Sets the value of the '{@link Juri.Loan#getBook <em>Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book</em>' reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(Book value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Juri.Member#getLoan <em>Loan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(Member)
	 * @see Juri.JuriPackage#getLoan_Member()
	 * @see Juri.Member#getLoan
	 * @model opposite="loan" required="true"
	 * @generated
	 */
	Member getMember();

	/**
	 * Sets the value of the '{@link Juri.Loan#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(Member value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see Juri.JuriPackage#getLoan_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link Juri.Loan#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Loan
